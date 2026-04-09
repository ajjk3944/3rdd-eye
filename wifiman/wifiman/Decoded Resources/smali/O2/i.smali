.class public abstract LO2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC2/f;

.field public static final b:LC2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    sget-object v1, LC2/b;->DEFAULT:LC2/b;

    invoke-static {v0, v1}, LC2/f;->f(Ljava/lang/String;Ljava/lang/Object;)LC2/f;

    move-result-object v0

    sput-object v0, LO2/i;->a:LC2/f;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    invoke-static {v1, v0}, LC2/f;->f(Ljava/lang/String;Ljava/lang/Object;)LC2/f;

    move-result-object v0

    sput-object v0, LO2/i;->b:LC2/f;

    return-void
.end method
