.class LNh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LNh/n;


# direct methods
.method public constructor <init>(LNh/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/l;->a:LNh/n;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/l;->a:LNh/n;

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static {v0, p1}, LNh/n;->N0(LNh/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)LNh/z;

    move-result-object p1

    return-object p1
.end method
