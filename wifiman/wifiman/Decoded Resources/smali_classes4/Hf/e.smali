.class public final synthetic LHf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LHf/d;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(LHf/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHf/e;->a:LHf/d;

    iput p2, p0, LHf/e;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LHf/e;->a:LHf/d;

    iget v1, p0, LHf/e;->b:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, LHf/f;->a(LHf/d;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
