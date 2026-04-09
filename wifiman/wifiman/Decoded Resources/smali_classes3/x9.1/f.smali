.class public final synthetic Lx9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lx9/a;

.field public final synthetic b:LT/z1;

.field public final synthetic c:LT/z1;

.field public final synthetic d:LT/z1;

.field public final synthetic e:LT/z1;

.field public final synthetic f:LT/z1;


# direct methods
.method public synthetic constructor <init>(Lx9/a;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/f;->a:Lx9/a;

    iput-object p2, p0, Lx9/f;->b:LT/z1;

    iput-object p3, p0, Lx9/f;->c:LT/z1;

    iput-object p4, p0, Lx9/f;->d:LT/z1;

    iput-object p5, p0, Lx9/f;->e:LT/z1;

    iput-object p6, p0, Lx9/f;->f:LT/z1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lx9/f;->a:Lx9/a;

    iget-object v1, p0, Lx9/f;->b:LT/z1;

    iget-object v2, p0, Lx9/f;->c:LT/z1;

    iget-object v3, p0, Lx9/f;->d:LT/z1;

    iget-object v4, p0, Lx9/f;->e:LT/z1;

    iget-object v5, p0, Lx9/f;->f:LT/z1;

    move-object v6, p1

    check-cast v6, Lo0/f;

    invoke-static/range {v0 .. v6}, Lx9/h;->d(Lx9/a;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;Lo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
