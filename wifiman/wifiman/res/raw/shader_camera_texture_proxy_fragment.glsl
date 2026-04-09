#extension GL_OES_EGL_image_external : require

precision mediump float;
varying vec2 v_TexCoord;
uniform samplerExternalOES sTexture;
uniform highp vec4 u_OverlayColor;

void main() {
    gl_FragColor = texture2D(sTexture, v_TexCoord);
    gl_FragColor.r = gl_FragColor.r * (1.0 - u_OverlayColor.a) + u_OverlayColor.r * u_OverlayColor.a;
    gl_FragColor.g = gl_FragColor.g * (1.0 - u_OverlayColor.a) + u_OverlayColor.g * u_OverlayColor.a;
    gl_FragColor.b = gl_FragColor.b * (1.0 - u_OverlayColor.a) + u_OverlayColor.b * u_OverlayColor.a;
}