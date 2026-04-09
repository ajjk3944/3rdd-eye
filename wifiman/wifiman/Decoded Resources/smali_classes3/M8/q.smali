.class public final synthetic LM8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/q;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LM8/q;->a:Lmh/l;

    check-cast p1, LM8/a;

    check-cast p2, LM8/a;

    invoke-static {v0, p1, p2}, LM8/r;->d(Lmh/l;LM8/a;LM8/a;)I

    move-result p1

    return p1
.end method
