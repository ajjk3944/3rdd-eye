.class public final synthetic Lef/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LL0/d;

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LL0/d;Lmh/l;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lef/h;->a:LL0/d;

    iput-object p2, p0, Lef/h;->b:Lmh/l;

    iput-object p3, p0, Lef/h;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lef/h;->a:LL0/d;

    iget-object v1, p0, Lef/h;->b:Lmh/l;

    iget-object v2, p0, Lef/h;->c:Ljava/lang/String;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lef/j;->b(LL0/d;Lmh/l;Ljava/lang/String;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
