.class public final synthetic LVi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LVi/k;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LVi/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVi/h;->a:Ljava/lang/String;

    iput-object p2, p0, LVi/h;->b:LVi/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LVi/h;->a:Ljava/lang/String;

    iget-object v1, p0, LVi/h;->b:LVi/k;

    invoke-static {v0, v1}, LVi/k;->n(Ljava/lang/String;LVi/k;)LXi/f;

    move-result-object v0

    return-object v0
.end method
