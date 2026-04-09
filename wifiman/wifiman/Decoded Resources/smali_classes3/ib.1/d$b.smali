.class final Lib/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/d;->h(Ljava/lang/String;Ljava/util/List;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lib/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lib/d$b;

    invoke-direct {v0}, Lib/d$b;-><init>()V

    sput-object v0, Lib/d$b;->a:Lib/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lib/b;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lib/b;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lib/b;

    invoke-virtual {p0, p1}, Lib/d$b;->a(Lib/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
