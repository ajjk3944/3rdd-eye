.class LRh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LRh/j0;

.field private final b:[LRh/h;


# direct methods
.method public constructor <init>(LRh/j0;[LRh/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/b;->a:LRh/j0;

    iput-object p2, p0, LRh/b;->b:[LRh/h;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LRh/b;->a:LRh/j0;

    iget-object v1, p0, LRh/b;->b:[LRh/h;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, LRh/d;->b(LRh/j0;[LRh/h;I)LRh/h;

    move-result-object p1

    return-object p1
.end method
