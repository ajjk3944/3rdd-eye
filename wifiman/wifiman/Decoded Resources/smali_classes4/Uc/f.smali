.class public final synthetic LUc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;

.field public final synthetic b:Lkotlin/jvm/internal/N;

.field public final synthetic c:Lkotlin/jvm/internal/N;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUc/f;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, LUc/f;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, LUc/f;->c:Lkotlin/jvm/internal/N;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, LUc/f;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, LUc/f;->b:Lkotlin/jvm/internal/N;

    iget-object v2, p0, LUc/f;->c:Lkotlin/jvm/internal/N;

    invoke-static {v0, v1, v2}, LUc/i;->e(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    return-void
.end method
