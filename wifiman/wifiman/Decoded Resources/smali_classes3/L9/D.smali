.class public final synthetic LL9/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LL9/d;

.field public final synthetic b:Lmh/q;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LL9/d;Lmh/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/D;->a:LL9/d;

    iput-object p2, p0, LL9/D;->b:Lmh/q;

    iput p3, p0, LL9/D;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LL9/D;->a:LL9/d;

    iget-object v1, p0, LL9/D;->b:Lmh/q;

    iget v2, p0, LL9/D;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, LL9/E;->b(LL9/d;Lmh/q;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
