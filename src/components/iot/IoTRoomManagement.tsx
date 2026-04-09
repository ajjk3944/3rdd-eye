'use client'

import { useState } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Dialog, DialogContent, DialogHeader, DialogTitle, DialogFooter } from '@/components/ui/dialog'
import { Home, Sofa, Bed, UtensilsCrossed, Bath, TreePine, Warehouse, Briefcase, Baby, DoorOpen, Plus } from 'lucide-react'
import { IoTRoom, IoTDeviceInfo, getIoTDevice } from '@/lib/native-plugins'
import { toast } from 'sonner'

interface IoTRoomManagementProps {
  rooms: IoTRoom[]
  devices: IoTDeviceInfo[]
  onRoomClick: (roomId: number) => void
  onRefresh: () => void
}

const roomIcons: Record<string, any> = {
  home: Home,
  sofa: Sofa,
  bed: Bed,
  utensils: UtensilsCrossed,
  bath: Bath,
  tree: TreePine,
  warehouse: Warehouse,
  briefcase: Briefcase,
  baby: Baby,
  door: DoorOpen,
}

export default function IoTRoomManagement({ rooms, devices, onRoomClick, onRefresh }: IoTRoomManagementProps) {
  const [showAddDialog, setShowAddDialog] = useState(false)
  const [newRoomName, setNewRoomName] = useState('')
  const [selectedIcon, setSelectedIcon] = useState('home')

  const iotPlugin = getIoTDevice()

  const handleAddRoom = async () => {
    if (!iotPlugin || !newRoomName.trim()) return
    try {
      await iotPlugin.addRoom({ name: newRoomName, icon: selectedIcon })
      toast.success('Room added')
      setShowAddDialog(false)
      setNewRoomName('')
      setSelectedIcon('home')
      onRefresh()
    } catch (error: any) {
      toast.error('Failed to add room', { description: error.message })
    }
  }

  const unassignedDevices = devices.filter(d => d.roomId === 0)

  return (
    <div className="p-4 space-y-4">
      <div className="flex justify-between items-center">
        <h2 className="text-xl font-semibold text-white">Rooms</h2>
        <Button onClick={() => setShowAddDialog(true)} className="bg-cyan-600 hover:bg-cyan-700">
          <Plus size={18} className="mr-2" />
          Add Room
        </Button>
      </div>

      {/* Rooms List */}
      <div className="space-y-3">
        {rooms.map((room) => {
          const Icon = roomIcons[room.icon] || Home
          return (
            <Card
              key={room.id}
              className="bg-black/40 border-cyan-900/30 hover:border-cyan-700/50 transition-colors cursor-pointer"
              onClick={() => onRoomClick(room.id)}
            >
              <CardContent className="p-4">
                <div className="flex items-center gap-3">
                  <div className="p-2 bg-cyan-900/20 rounded-lg">
                    <Icon className="text-cyan-400" size={24} />
                  </div>
                  <div className="flex-1">
                    <h3 className="font-semibold text-white">{room.name}</h3>
                    <p className="text-sm text-gray-400">{room.deviceCount} devices</p>
                  </div>
                  <span className="text-gray-400">→</span>
                </div>
              </CardContent>
            </Card>
          )
        })}
      </div>

      {/* Unassigned Devices */}
      {unassignedDevices.length > 0 && (
        <Card className="bg-black/40 border-cyan-900/30">
          <CardHeader>
            <CardTitle className="text-white">Unassigned Devices</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-gray-400 text-sm mb-2">
              {unassignedDevices.length} devices not assigned to any room
            </p>
            <div className="space-y-2">
              {unassignedDevices.slice(0, 3).map((device) => (
                <div key={device.id} className="text-sm text-gray-300">
                  • {device.deviceName || device.manufacturer || 'Unknown'}
                </div>
              ))}
              {unassignedDevices.length > 3 && (
                <div className="text-sm text-gray-400">
                  + {unassignedDevices.length - 3} more
                </div>
              )}
            </div>
          </CardContent>
        </Card>
      )}

      {/* Add Room Dialog */}
      <Dialog open={showAddDialog} onOpenChange={setShowAddDialog}>
        <DialogContent className="bg-[#0d1a0d] border-cyan-900/30">
          <DialogHeader>
            <DialogTitle className="text-white">Add New Room</DialogTitle>
          </DialogHeader>
          <div className="space-y-4">
            <div>
              <label className="text-sm text-gray-400 mb-2 block">Room Name</label>
              <Input
                value={newRoomName}
                onChange={(e) => setNewRoomName(e.target.value)}
                placeholder="e.g., Living Room"
                className="bg-black/40 border-cyan-900/30 text-white"
              />
            </div>
            <div>
              <label className="text-sm text-gray-400 mb-2 block">Icon</label>
              <div className="grid grid-cols-5 gap-2">
                {Object.entries(roomIcons).map(([key, Icon]) => (
                  <button
                    key={key}
                    onClick={() => setSelectedIcon(key)}
                    className={`p-3 rounded-lg border transition-colors ${
                      selectedIcon === key
                        ? 'bg-cyan-600 border-cyan-500'
                        : 'bg-black/40 border-cyan-900/30 hover:border-cyan-700/50'
                    }`}
                  >
                    <Icon className="text-cyan-400 mx-auto" size={20} />
                  </button>
                ))}
              </div>
            </div>
          </div>
          <DialogFooter>
            <Button variant="outline" onClick={() => setShowAddDialog(false)}>
              Cancel
            </Button>
            <Button onClick={handleAddRoom} className="bg-cyan-600 hover:bg-cyan-700">
              Add Room
            </Button>
          </DialogFooter>
        </DialogContent>
      </Dialog>
    </div>
  )
}
