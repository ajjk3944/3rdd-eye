.class public LI2/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/s$b;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 4

    new-instance v0, LI2/s;

    iget-object v1, p0, LI2/s$b;->a:Landroid/content/res/Resources;

    const-class v2, Landroid/net/Uri;

    const-class v3, Ljava/io/InputStream;

    invoke-virtual {p1, v2, v3}, LI2/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LI2/n;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LI2/s;-><init>(Landroid/content/res/Resources;LI2/n;)V

    return-object v0
.end method
