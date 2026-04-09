.class public final LLi/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/s;->b(LLi/g;I)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/g;

.field final synthetic b:I


# direct methods
.method public constructor <init>(LLi/g;I)V
    .locals 0

    iput-object p1, p0, LLi/s$a;->a:LLi/g;

    iput p2, p0, LLi/s$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/L;

    invoke-direct {v0}, Lkotlin/jvm/internal/L;-><init>()V

    iget-object v1, p0, LLi/s$a;->a:LLi/g;

    new-instance v2, LLi/s$b;

    iget v3, p0, LLi/s$a;->b:I

    invoke-direct {v2, v0, v3, p1}, LLi/s$b;-><init>(Lkotlin/jvm/internal/L;ILLi/h;)V

    invoke-interface {v1, v2, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
