.class final Lcom/bumptech/glide/load/engine/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/engine/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:LC2/a;

.field final synthetic b:Lcom/bumptech/glide/load/engine/h;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/engine/h;LC2/a;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/h$c;->b:Lcom/bumptech/glide/load/engine/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/h$c;->a:LC2/a;

    return-void
.end method


# virtual methods
.method public a(LE2/c;)LE2/c;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h$c;->b:Lcom/bumptech/glide/load/engine/h;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h$c;->a:LC2/a;

    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/engine/h;->I(LC2/a;LE2/c;)LE2/c;

    move-result-object p1

    return-object p1
.end method
