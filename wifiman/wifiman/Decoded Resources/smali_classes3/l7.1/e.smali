.class public final synthetic Ll7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lkotlin/jvm/internal/K;

.field public final synthetic c:Ll7/f;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/internal/K;Ll7/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll7/e;->a:J

    iput-object p3, p0, Ll7/e;->b:Lkotlin/jvm/internal/K;

    iput-object p4, p0, Ll7/e;->c:Ll7/f;

    iput p5, p0, Ll7/e;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-wide v0, p0, Ll7/e;->a:J

    iget-object v2, p0, Ll7/e;->b:Lkotlin/jvm/internal/K;

    iget-object v3, p0, Ll7/e;->c:Ll7/f;

    iget v4, p0, Ll7/e;->d:I

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    move-object v7, p2

    check-cast v7, Ll7/f$b;

    invoke-static/range {v0 .. v7}, Ll7/f;->d(JLkotlin/jvm/internal/K;Ll7/f;IJLl7/f$b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
