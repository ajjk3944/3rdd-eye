.class public final synthetic LY9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LY9/k;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(LY9/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY9/h;->a:LY9/k;

    iput p2, p0, LY9/h;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LY9/h;->a:LY9/k;

    iget v1, p0, LY9/h;->b:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, LY9/i;->e(LY9/k;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
