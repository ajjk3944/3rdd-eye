.class public abstract LJ0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[Lth/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/z;

    const-string v1, "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    const/4 v2, 0x1

    const-class v3, LJ0/u;

    const-string v4, "testTagsAsResourceId"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    new-array v1, v2, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LJ0/u;->a:[Lth/l;

    sget-object v0, LJ0/r;->a:LJ0/r;

    invoke-virtual {v0}, LJ0/r;->a()LJ0/v;

    return-void
.end method

.method public static final a(LJ0/w;Z)V
    .locals 3

    sget-object v0, LJ0/r;->a:LJ0/r;

    invoke-virtual {v0}, LJ0/r;->a()LJ0/v;

    move-result-object v0

    sget-object v1, LJ0/u;->a:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, LJ0/v;->d(LJ0/w;Lth/l;Ljava/lang/Object;)V

    return-void
.end method
