.class public final synthetic Lkotlin/jvm/internal/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Y;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/jvm/internal/X;->a:Lkotlin/jvm/internal/Y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/X;->a:Lkotlin/jvm/internal/Y;

    check-cast p1, Lth/r;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Y;->a(Lkotlin/jvm/internal/Y;Lth/r;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
