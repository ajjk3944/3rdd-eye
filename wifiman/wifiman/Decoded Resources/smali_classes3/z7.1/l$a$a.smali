.class final Lz7/l$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/l$a;->a()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz7/l$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/l$a$a;

    invoke-direct {v0}, Lz7/l$a$a;-><init>()V

    sput-object v0, Lz7/l$a$a;->a:Lz7/l$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/NetworkInterface;)Lz7/n;
    .locals 2

    new-instance v0, Lz7/n;

    const-string/jumbo v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lz7/n;-><init>(Ljava/net/NetworkInterface;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/NetworkInterface;

    invoke-virtual {p0, p1}, Lz7/l$a$a;->a(Ljava/net/NetworkInterface;)Lz7/n;

    move-result-object p1

    return-object p1
.end method
