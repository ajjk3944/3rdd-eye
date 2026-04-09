.class public final synthetic Lkotlin/text/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/H;->a:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/text/H;->a:Ljava/lang/CharSequence;

    check-cast p1, Lsh/i;

    invoke-static {v0, p1}, Lkotlin/text/I;->R(Ljava/lang/CharSequence;Lsh/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
