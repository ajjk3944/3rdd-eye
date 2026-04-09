.class Lwh/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field private final a:Lmh/p;


# direct methods
.method public constructor <init>(Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/a0;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lwh/a0;->a:Lmh/p;

    invoke-static {v0, p1, p2}, Lwh/d0;->i(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
