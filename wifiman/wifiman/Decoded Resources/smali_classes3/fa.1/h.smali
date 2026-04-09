.class public final synthetic Lfa/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lfa/j;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lfa/j;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa/h;->a:Lfa/j;

    iput p2, p0, Lfa/h;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfa/h;->a:Lfa/j;

    iget v1, p0, Lfa/h;->b:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lfa/i;->b(Lfa/j;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
