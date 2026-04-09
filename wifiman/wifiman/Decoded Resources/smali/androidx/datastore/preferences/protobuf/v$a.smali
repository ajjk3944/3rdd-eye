.class public abstract Landroidx/datastore/preferences/protobuf/v$a;
.super Landroidx/datastore/preferences/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/datastore/preferences/protobuf/v;

.field protected b:Landroidx/datastore/preferences/protobuf/v;

.field protected c:Z


# direct methods
.method protected constructor <init>(Landroidx/datastore/preferences/protobuf/v;)V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/a$a;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/v$a;->a:Landroidx/datastore/preferences/protobuf/v;

    sget-object v0, Landroidx/datastore/preferences/protobuf/v$d;->NEW_MUTABLE_INSTANCE:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {p1, v0}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/v;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/datastore/preferences/protobuf/v$a;->c:Z

    return-void
.end method

.method private w(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;)V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/Y;->a()Landroidx/datastore/preferences/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/Y;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/c0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Landroidx/datastore/preferences/protobuf/M;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->r()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->p()Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic f(Landroidx/datastore/preferences/protobuf/a;)Landroidx/datastore/preferences/protobuf/a$a;
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/v;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/v$a;->t(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object p1

    return-object p1
.end method

.method public final n()Landroidx/datastore/preferences/protobuf/v;
    .locals 2

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->o()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/v;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/a$a;->k(Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public o()Landroidx/datastore/preferences/protobuf/v;
    .locals 1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/v;->x()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->c:Z

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    return-object v0
.end method

.method public p()Landroidx/datastore/preferences/protobuf/v$a;
    .locals 2

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->r()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/v;->A()Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->o()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/v$a;->u(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v$a;

    return-object v0
.end method

.method protected q()V
    .locals 2

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    sget-object v1, Landroidx/datastore/preferences/protobuf/v$d;->NEW_MUTABLE_INSTANCE:Landroidx/datastore/preferences/protobuf/v$d;

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/v;->o(Landroidx/datastore/preferences/protobuf/v$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/v;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    invoke-direct {p0, v0, v1}, Landroidx/datastore/preferences/protobuf/v$a;->w(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;)V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->c:Z

    :cond_0
    return-void
.end method

.method public r()Landroidx/datastore/preferences/protobuf/v;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->a:Landroidx/datastore/preferences/protobuf/v;

    return-object v0
.end method

.method protected t(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v$a;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/v$a;->u(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v$a;

    move-result-object p1

    return-object p1
.end method

.method public u(Landroidx/datastore/preferences/protobuf/v;)Landroidx/datastore/preferences/protobuf/v$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->q()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/v$a;->b:Landroidx/datastore/preferences/protobuf/v;

    invoke-direct {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/v$a;->w(Landroidx/datastore/preferences/protobuf/v;Landroidx/datastore/preferences/protobuf/v;)V

    return-object p0
.end method

.method public bridge synthetic y()Landroidx/datastore/preferences/protobuf/M;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/v$a;->o()Landroidx/datastore/preferences/protobuf/v;

    move-result-object v0

    return-object v0
.end method
