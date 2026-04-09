.class final LP8/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/i;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/i$b;

    invoke-direct {v0}, LP8/i$b;-><init>()V

    sput-object v0, LP8/i$b;->a:LP8/i$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)LDj/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsh/i;

    const/4 v1, 0x1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lsh/i;-><init>(II)V

    invoke-static {v0}, LAg/b;->c(Lsh/g;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LP8/i$b;->a(Ljava/util/Set;)LDj/a;

    move-result-object p1

    return-object p1
.end method
