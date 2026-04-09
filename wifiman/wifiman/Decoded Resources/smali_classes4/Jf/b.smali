.class public final synthetic LJf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:LT/z1;

.field public final synthetic c:Lm0/U0;

.field public final synthetic d:Z

.field public final synthetic e:Ls0/p;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(JLT/z1;Lm0/U0;ZLs0/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LJf/b;->a:J

    iput-object p3, p0, LJf/b;->b:LT/z1;

    iput-object p4, p0, LJf/b;->c:Lm0/U0;

    iput-boolean p5, p0, LJf/b;->d:Z

    iput-object p6, p0, LJf/b;->e:Ls0/p;

    iput-wide p7, p0, LJf/b;->f:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-wide v0, p0, LJf/b;->a:J

    iget-object v2, p0, LJf/b;->b:LT/z1;

    iget-object v3, p0, LJf/b;->c:Lm0/U0;

    iget-boolean v4, p0, LJf/b;->d:Z

    iget-object v5, p0, LJf/b;->e:Ls0/p;

    iget-wide v6, p0, LJf/b;->f:J

    move-object v8, p1

    check-cast v8, Lo0/f;

    invoke-static/range {v0 .. v8}, LJf/d;->a(JLT/z1;Lm0/U0;ZLs0/p;JLo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
