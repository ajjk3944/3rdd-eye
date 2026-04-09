.class final LN/G$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G;->b(ZLmh/a;Lmh/a;JLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(JLmh/a;)V
    .locals 0

    iput-wide p1, p0, LN/G$c;->a:J

    iput-object p3, p0, LN/G$c;->b:Lmh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 13

    iget-wide v1, p0, LN/G$c;->a:J

    iget-object v0, p0, LN/G$c;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/16 v11, 0x76

    const/4 v12, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LN/G$c;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
