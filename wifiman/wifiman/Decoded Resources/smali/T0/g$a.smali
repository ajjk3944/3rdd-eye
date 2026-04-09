.class final LT0/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT0/g;->e(Lm0/l0;JF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/l0;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lm0/l0;J)V
    .locals 0

    iput-object p1, p0, LT0/g$a;->a:Lm0/l0;

    iput-wide p2, p0, LT0/g$a;->b:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Shader;
    .locals 3

    iget-object v0, p0, LT0/g$a;->a:Lm0/l0;

    check-cast v0, Lm0/e1;

    iget-wide v1, p0, LT0/g$a;->b:J

    invoke-virtual {v0, v1, v2}, Lm0/e1;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT0/g$a;->a()Landroid/graphics/Shader;

    move-result-object v0

    return-object v0
.end method
