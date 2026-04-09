.class final Ly7/n$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly7/n$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly7/n$c;

    invoke-direct {v0}, Ly7/n$c;-><init>()V

    sput-object v0, Ly7/n$c;->a:Ly7/n$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/text/p;
    .locals 2

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "^([a-zA-Z\\d\\-_]+)\\.[v]?(\\d+)\\.(\\d+).(\\d+([-][a-zA-Z\\d\\-_]+)?)\\.([a-zA-Z\\d\\-_]+)"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly7/n$c;->a()Lkotlin/text/p;

    move-result-object v0

    return-object v0
.end method
