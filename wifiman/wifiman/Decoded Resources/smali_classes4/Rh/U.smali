.class LRh/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/U;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRh/U;->a:Ljava/lang/String;

    check-cast p1, LRh/f0$a$a;

    invoke-static {v0, p1}, LRh/X;->r0(Ljava/lang/String;LRh/f0$a$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
