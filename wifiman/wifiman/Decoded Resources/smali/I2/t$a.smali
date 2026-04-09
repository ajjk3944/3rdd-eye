.class final LI2/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/t$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public d(LI2/r;)LI2/n;
    .locals 4

    new-instance v0, LI2/t;

    iget-object v1, p0, LI2/t$a;->a:Landroid/content/Context;

    const-class v2, Ljava/lang/Integer;

    const-class v3, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v2, v3}, LI2/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LI2/n;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LI2/t;-><init>(Landroid/content/Context;LI2/n;)V

    return-object v0
.end method
