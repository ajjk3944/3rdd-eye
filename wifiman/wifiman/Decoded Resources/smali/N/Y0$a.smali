.class final LN/Y0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Y0;->a(LN/b0;JJLmh/q;ZLmh/t;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/Y0;

.field final synthetic b:LN/b0;

.field final synthetic c:J

.field final synthetic d:J

.field final synthetic e:Lmh/q;

.field final synthetic f:Z

.field final synthetic g:Lmh/t;

.field final synthetic h:I


# direct methods
.method constructor <init>(LN/Y0;LN/b0;JJLmh/q;ZLmh/t;I)V
    .locals 0

    iput-object p1, p0, LN/Y0$a;->a:LN/Y0;

    iput-object p2, p0, LN/Y0$a;->b:LN/b0;

    iput-wide p3, p0, LN/Y0$a;->c:J

    iput-wide p5, p0, LN/Y0$a;->d:J

    iput-object p7, p0, LN/Y0$a;->e:Lmh/q;

    iput-boolean p8, p0, LN/Y0$a;->f:Z

    iput-object p9, p0, LN/Y0$a;->g:Lmh/t;

    iput p10, p0, LN/Y0$a;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    iget-object v0, p0, LN/Y0$a;->a:LN/Y0;

    iget-object v1, p0, LN/Y0$a;->b:LN/b0;

    iget-wide v2, p0, LN/Y0$a;->c:J

    iget-wide v4, p0, LN/Y0$a;->d:J

    iget-object v6, p0, LN/Y0$a;->e:Lmh/q;

    iget-boolean v7, p0, LN/Y0$a;->f:Z

    iget-object v8, p0, LN/Y0$a;->g:Lmh/t;

    iget p2, p0, LN/Y0$a;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    move-object v9, p1

    invoke-virtual/range {v0 .. v10}, LN/Y0;->a(LN/b0;JJLmh/q;ZLmh/t;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/Y0$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
