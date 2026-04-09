.class public final LM5/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->d(LT/q0;LT/z1;LT/l;I)LE6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:LT/q0;

.field final synthetic c:LT/z1;


# direct methods
.method constructor <init>(LT/q0;LT/z1;)V
    .locals 0

    iput-object p1, p0, LM5/a$i;->b:LT/q0;

    iput-object p2, p0, LM5/a$i;->c:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 0

    invoke-static {p0, p1, p2}, LE6/e$a;->a(LE6/e;FF)V

    return-void
.end method

.method public b(FF)V
    .locals 9

    iget-object v0, p0, LM5/a$i;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD6/a;

    if-eqz v0, :cond_1

    iget-object v1, p0, LM5/a$i;->c:LT/z1;

    iget-object v2, p0, LM5/a$i;->b:LT/q0;

    invoke-virtual {v0}, LD6/a;->k()J

    move-result-wide v3

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ly/c;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LM5/a$i;->a:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-interface {v2, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LM5/a$i;->a:Z

    goto :goto_0

    :cond_0
    invoke-static {v3, v4}, LD6/a;->g(J)F

    move-result v0

    add-float/2addr v0, p1

    sub-float v5, v0, p2

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LD6/a;->d(JFFILjava/lang/Object;)J

    move-result-wide p1

    invoke-static {p1, p2}, LD6/a;->a(J)LD6/a;

    move-result-object p1

    invoke-interface {v2, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LM5/a$i;->a:Z

    :cond_1
    :goto_0
    return-void
.end method
