.class public final synthetic Lsf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LL0/d;

.field public final synthetic b:Lsf/c;


# direct methods
.method public synthetic constructor <init>(LL0/d;Lsf/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsf/j;->a:LL0/d;

    iput-object p2, p0, Lsf/j;->b:Lsf/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lsf/j;->a:LL0/d;

    iget-object v1, p0, Lsf/j;->b:Lsf/c;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lsf/i$c;->a(LL0/d;Lsf/c;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
