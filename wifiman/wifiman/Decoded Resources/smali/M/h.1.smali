.class public final LM/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/q;


# instance fields
.field private final a:Lf0/c;

.field private final b:LM/j;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/c;LM/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/h;->a:Lf0/c;

    iput-object p2, p0, LM/h;->b:LM/j;

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LM/h;->c:J

    return-void
.end method


# virtual methods
.method public a(LY0/p;JLY0/t;J)J
    .locals 6

    iget-object p2, p0, LM/h;->b:LM/j;

    invoke-interface {p2}, LM/j;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p2, p0, LM/h;->c:J

    :goto_0
    iput-wide p2, p0, LM/h;->c:J

    iget-object v0, p0, LM/h;->a:Lf0/c;

    sget-object v1, LY0/r;->b:LY0/r$a;

    invoke-virtual {v1}, LY0/r$a;->a()J

    move-result-wide v3

    move-wide v1, p5

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide p4

    invoke-virtual {p1}, LY0/p;->i()J

    move-result-wide v0

    invoke-static {p2, p3}, LY0/o;->d(J)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, LY0/n;->l(JJ)J

    move-result-wide p1

    invoke-static {p1, p2, p4, p5}, LY0/n;->l(JJ)J

    move-result-wide p1

    return-wide p1
.end method
