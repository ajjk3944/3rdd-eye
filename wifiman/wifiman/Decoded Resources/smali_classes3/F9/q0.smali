.class public final synthetic LF9/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ls9/b;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Lmh/a;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ls9/b;JZLmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/q0;->a:Ls9/b;

    iput-wide p2, p0, LF9/q0;->b:J

    iput-boolean p4, p0, LF9/q0;->c:Z

    iput-object p5, p0, LF9/q0;->d:Lmh/a;

    iput p6, p0, LF9/q0;->e:I

    iput p7, p0, LF9/q0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LF9/q0;->a:Ls9/b;

    iget-wide v1, p0, LF9/q0;->b:J

    iget-boolean v3, p0, LF9/q0;->c:Z

    iget-object v4, p0, LF9/q0;->d:Lmh/a;

    iget v5, p0, LF9/q0;->e:I

    iget v6, p0, LF9/q0;->f:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LF9/r0;->a(Ls9/b;JZLmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
