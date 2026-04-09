.class public final Ls7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls7/c;

.field private final b:Ls7/a;

.field private final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Ls7/c;Ls7/a;Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "identification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/g;->a:Ls7/c;

    iput-object p2, p0, Ls7/g;->b:Ls7/a;

    iput-object p3, p0, Ls7/g;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ls7/a;
    .locals 1

    iget-object v0, p0, Ls7/g;->b:Ls7/a;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ls7/g;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ls7/c;
    .locals 1

    iget-object v0, p0, Ls7/g;->a:Ls7/c;

    return-object v0
.end method
