.class public final synthetic LE9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lr/a;

.field public final synthetic c:LT/q0;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(JLr/a;LT/q0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LE9/i;->a:J

    iput-object p3, p0, LE9/i;->b:Lr/a;

    iput-object p4, p0, LE9/i;->c:LT/q0;

    iput-wide p5, p0, LE9/i;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-wide v0, p0, LE9/i;->a:J

    iget-object v2, p0, LE9/i;->b:Lr/a;

    iget-object v3, p0, LE9/i;->c:LT/q0;

    iget-wide v4, p0, LE9/i;->d:J

    move-object v6, p1

    check-cast v6, Lo0/f;

    invoke-static/range {v0 .. v6}, LE9/l;->a(JLr/a;LT/q0;JLo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
