.class Lkj/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkj/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lkj/a;


# direct methods
.method constructor <init>(Lkj/a;)V
    .locals 0

    iput-object p1, p0, Lkj/a$c;->a:Lkj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnj/u;)V
    .locals 1

    iget-object v0, p0, Lkj/a$c;->a:Lkj/a;

    invoke-static {v0}, Lkj/a;->e(Lkj/a;)Lkj/h;

    move-result-object v0

    invoke-virtual {v0}, Lkj/h;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkj/a$c;->a:Lkj/a;

    invoke-static {v0}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkj/b;->R(Lnj/u;)V

    :cond_0
    return-void
.end method
