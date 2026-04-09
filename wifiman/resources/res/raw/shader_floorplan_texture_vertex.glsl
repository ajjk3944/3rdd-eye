uniform mat4 u_MVPMatrix;
attribute vec4 a_Position;
attribute vec2 a_TexCoordinate;
varying vec2 v_TexCoordinate;// This will be passed into the fragment shader.

void main()
{

    // Pass through the texture coordinate.
    v_TexCoordinate = a_TexCoordinate;

    gl_Position = u_MVPMatrix * a_Position;
}                              