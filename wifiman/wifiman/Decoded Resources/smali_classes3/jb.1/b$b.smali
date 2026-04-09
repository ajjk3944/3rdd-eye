.class final Ljb/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/b;-><init>(Lcb/a;LAb/a;Ljava/lang/String;Ljava/lang/String;LGb/f;Ljb/i;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ljb/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljb/b$b;

    invoke-direct {v0}, Ljb/b$b;-><init>()V

    sput-object v0, Ljb/b$b;->a:Ljb/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljb/g;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljb/g;->f()Lgg/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/b;->h0(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljb/g;

    invoke-virtual {p0, p1}, Ljb/b$b;->a(Ljb/g;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
