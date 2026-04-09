.class public final synthetic Lkotlin/text/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lkotlin/text/m$b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/text/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/n;->a:Lkotlin/text/m$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/text/n;->a:Lkotlin/text/m$b;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lkotlin/text/m$b;->v(Lkotlin/text/m$b;I)Lkotlin/text/j;

    move-result-object p1

    return-object p1
.end method
