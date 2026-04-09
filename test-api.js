// Quick test script to verify the API returns proper data
const http = require('http');

// Start a simple test
console.log('Testing /api/saved-wifi endpoint...\n');

const options = {
  hostname: 'localhost',
  port: 3000,
  path: '/api/saved-wifi',
  method: 'GET'
};

const req = http.request(options, (res) => {
  let data = '';

  res.on('data', (chunk) => {
    data += chunk;
  });

  res.on('end', () => {
    console.log('Status Code:', res.statusCode);
    console.log('Response:', data);
    
    try {
      const json = JSON.parse(data);
      console.log('\nParsed JSON:');
      console.log('- success:', json.success);
      console.log('- networks type:', Array.isArray(json.networks) ? 'array' : typeof json.networks);
      console.log('- networks length:', json.networks?.length || 0);
      console.log('- networks value:', json.networks);
      
      if (!Array.isArray(json.networks)) {
        console.error('\n❌ ERROR: networks is not an array!');
        console.error('This will cause "s is not iterable" error');
      } else {
        console.log('\n✅ API response is valid');
      }
    } catch (e) {
      console.error('\n❌ Failed to parse JSON:', e.message);
    }
  });
});

req.on('error', (e) => {
  console.error('❌ Request failed:', e.message);
  console.log('\nMake sure the dev server is running: npm run dev');
});

req.end();
