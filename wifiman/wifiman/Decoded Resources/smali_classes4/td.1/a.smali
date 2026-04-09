.class public abstract Ltd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltd/a$a;
    }
.end annotation


# static fields
.field public static final b:Ltd/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltd/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltd/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltd/a;->b:Ltd/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final b(Lgg/i;)Lgg/i;
    .locals 2

    const-string v0, "measurementStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    new-instance v1, Ltd/a$c;

    invoke-direct {v1, v0}, Ltd/a$c;-><init>(Ljava/util/LinkedList;)V

    invoke-virtual {p1, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v1, Ltd/a$d;->a:Ltd/a$d;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v1, Ltd/a$b;

    invoke-direct {v1, v0}, Ltd/a$b;-><init>(Ljava/util/LinkedList;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/i;->M(Lgg/D;)Lgg/i;

    move-result-object p1

    sget-object v0, Ltd/a$e;->a:Ltd/a$e;

    invoke-virtual {p1, v0}, Lgg/i;->g1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
