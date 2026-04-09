.class public final synthetic LTe/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LTe/l0;

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Lmh/l;


# direct methods
.method public synthetic constructor <init>(LTe/l0;Lmh/l;Ls9/d;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/m0;->a:LTe/l0;

    iput-object p2, p0, LTe/m0;->b:Lmh/l;

    iput-object p3, p0, LTe/m0;->c:Ls9/d;

    iput-object p4, p0, LTe/m0;->d:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LTe/m0;->a:LTe/l0;

    iget-object v1, p0, LTe/m0;->b:Lmh/l;

    iget-object v2, p0, LTe/m0;->c:Ls9/d;

    iget-object v3, p0, LTe/m0;->d:Lmh/l;

    check-cast p1, LS8/c;

    invoke-static {v0, v1, v2, v3, p1}, LTe/w0;->b(LTe/l0;Lmh/l;Ls9/d;Lmh/l;LS8/c;)Ls9/d;

    move-result-object p1

    return-object p1
.end method
