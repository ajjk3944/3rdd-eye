.class public final LI2/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 3

    new-instance v0, LI2/v;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, LI2/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LI2/n;

    move-result-object p1

    invoke-direct {v0, p1}, LI2/v;-><init>(LI2/n;)V

    return-object v0
.end method
