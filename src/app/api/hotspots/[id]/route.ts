import { NextRequest, NextResponse } from 'next/server'
import { PrismaClient } from '@prisma/client'

const prisma = new PrismaClient()

// GET /api/hotspots/[id] - Get single hotspot
export async function GET(
  request: NextRequest,
  { params }: { params: { id: string } }
) {
  try {
    const hotspot = await prisma.hotspot.findUnique({
      where: { id: params.id },
      include: {
        speedTests: {
          orderBy: { testedAt: 'desc' },
          take: 10
        }
      }
    })

    if (!hotspot) {
      return NextResponse.json(
        { success: false, error: 'Hotspot not found' },
        { status: 404 }
      )
    }

    return NextResponse.json({ success: true, hotspot })
  } catch (error: any) {
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}

// PATCH /api/hotspots/[id] - Update hotspot
export async function PATCH(
  request: NextRequest,
  { params }: { params: { id: string } }
) {
  try {
    const body = await request.json()
    
    const hotspot = await prisma.hotspot.update({
      where: { id: params.id },
      data: body
    })

    return NextResponse.json({ success: true, hotspot })
  } catch (error: any) {
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}

// DELETE /api/hotspots/[id] - Delete hotspot
export async function DELETE(
  request: NextRequest,
  { params }: { params: { id: string } }
) {
  try {
    await prisma.hotspot.delete({
      where: { id: params.id }
    })

    return NextResponse.json({ success: true })
  } catch (error: any) {
    return NextResponse.json(
      { success: false, error: error.message },
      { status: 500 }
    )
  }
}
