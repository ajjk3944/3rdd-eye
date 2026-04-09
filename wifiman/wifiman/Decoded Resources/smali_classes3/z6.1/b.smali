.class public Lz6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(FLk6/b;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz6/b;->b(FLk6/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(FLk6/b;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "chartValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly6/g;->b(F)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
