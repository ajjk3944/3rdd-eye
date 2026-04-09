.class final Lxd/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/a;->f(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lxd/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxd/a$c;

    invoke-direct {v0}, Lxd/a$c;-><init>()V

    sput-object v0, Lxd/a$c;->a:Lxd/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/b;)Lgg/f;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/b;

    invoke-virtual {p0, p1}, Lxd/a$c;->a(Lgg/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
