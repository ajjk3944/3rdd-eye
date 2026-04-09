.class LQ2/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/b;LQ2/j;LQ2/p;Landroid/content/Context;)Lcom/bumptech/glide/j;
    .locals 1

    new-instance v0, Lcom/bumptech/glide/j;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/bumptech/glide/j;-><init>(Lcom/bumptech/glide/b;LQ2/j;LQ2/p;Landroid/content/Context;)V

    return-object v0
.end method
