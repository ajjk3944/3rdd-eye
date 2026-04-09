.class public final synthetic Lkotlin/text/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lkotlin/text/p;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/text/p;Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/o;->a:Lkotlin/text/p;

    iput-object p2, p0, Lkotlin/text/o;->b:Ljava/lang/CharSequence;

    iput p3, p0, Lkotlin/text/o;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lkotlin/text/o;->a:Lkotlin/text/p;

    iget-object v1, p0, Lkotlin/text/o;->b:Ljava/lang/CharSequence;

    iget v2, p0, Lkotlin/text/o;->c:I

    invoke-static {v0, v1, v2}, Lkotlin/text/p;->a(Lkotlin/text/p;Ljava/lang/CharSequence;I)Lkotlin/text/l;

    move-result-object v0

    return-object v0
.end method
