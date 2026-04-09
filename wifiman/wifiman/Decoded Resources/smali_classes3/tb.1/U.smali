.class public final synthetic Ltb/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Llb/b;

.field public final synthetic c:Lpb/l;

.field public final synthetic d:Llb/c;

.field public final synthetic e:Z

.field public final synthetic f:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/U;->a:Ljava/lang/String;

    iput-object p2, p0, Ltb/U;->b:Llb/b;

    iput-object p3, p0, Ltb/U;->c:Lpb/l;

    iput-object p4, p0, Ltb/U;->d:Llb/c;

    iput-boolean p5, p0, Ltb/U;->e:Z

    iput-object p6, p0, Ltb/U;->f:Lmh/l;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ltb/U;->a:Ljava/lang/String;

    iget-object v1, p0, Ltb/U;->b:Llb/b;

    iget-object v2, p0, Ltb/U;->c:Lpb/l;

    iget-object v3, p0, Ltb/U;->d:Llb/c;

    iget-boolean v4, p0, Ltb/U;->e:Z

    iget-object v5, p0, Ltb/U;->f:Lmh/l;

    invoke-static/range {v0 .. v5}, Ltb/V;->d(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Ltb/u;

    move-result-object v0

    return-object v0
.end method
