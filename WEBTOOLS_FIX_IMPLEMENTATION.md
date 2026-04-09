# WebTools.tsx Fix Implementation

## Summary
This document outlines the complete fix for all 20 broken web analysis tools in the ThirdEye Android app.

## Changes Required

### 1. Replace `performWebAnalysis()` Function (Lines ~454-540)
**Current Issue:** Calls `/api/web-analysis` which doesn't exist in static export
**Fix:** Implement client-side analysis using CapacitorHttp

### 2. Add `runClientAnalysis()` Function
**New function** to route analysis based on tool type and return structured data

### 3. Expand `renderSpecificResults()` Function (Lines ~120-400)
**Current:** Only has 6 cases (wp-security, moz-authority, hsts-test, http2-test, lynx-viewer, server-os)
**Fix:** Add 14 missing cases for remaining tools

### 4. Fix Double Rendering in `renderToolView()` (Lines ~1650-1850)
**Current:** Shows both specific renderer AND generic key-value dump
**Fix:** Only show generic dump if specific renderer returns null

## Implementation Status
- [ ] Step 1: Replace performWebAnalysis with client-side version
- [ ] Step 2: Add runClientAnalysis function with all 20 tool analyzers
- [ ] Step 3: Add missing renderSpecificResults cases
- [ ] Step 4: Fix double rendering bug
- [ ] Step 5: Test all 20 tools

## Next Steps
Due to file size (2225 lines), implementing via systematic strReplace operations.
