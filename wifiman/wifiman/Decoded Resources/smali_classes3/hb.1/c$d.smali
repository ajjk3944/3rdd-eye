.class final Lhb/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c;->D()Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lhb/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhb/c$d;

    invoke-direct {v0}, Lhb/c$d;-><init>()V

    sput-object v0, Lhb/c$d;->a:Lhb/c$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpb/l;)Lgg/v;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpb/l;->l()Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpb/l;

    invoke-virtual {p0, p1}, Lhb/c$d;->a(Lpb/l;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
