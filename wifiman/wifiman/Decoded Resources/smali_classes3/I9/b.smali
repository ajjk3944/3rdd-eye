.class public final synthetic LI9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LT/q0;

.field public final synthetic c:LI9/e;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:LT/z1;


# direct methods
.method public synthetic constructor <init>(ZLT/q0;LI9/e;FFLT/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LI9/b;->a:Z

    iput-object p2, p0, LI9/b;->b:LT/q0;

    iput-object p3, p0, LI9/b;->c:LI9/e;

    iput p4, p0, LI9/b;->d:F

    iput p5, p0, LI9/b;->e:F

    iput-object p6, p0, LI9/b;->f:LT/z1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-boolean v0, p0, LI9/b;->a:Z

    iget-object v1, p0, LI9/b;->b:LT/q0;

    iget-object v2, p0, LI9/b;->c:LI9/e;

    iget v3, p0, LI9/b;->d:F

    iget v4, p0, LI9/b;->e:F

    iget-object v5, p0, LI9/b;->f:LT/z1;

    move-object v6, p1

    check-cast v6, Lo0/f;

    invoke-static/range {v0 .. v6}, LI9/d;->c(ZLT/q0;LI9/e;FFLT/z1;Lo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
