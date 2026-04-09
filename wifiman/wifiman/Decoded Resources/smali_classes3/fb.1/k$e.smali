.class final Lfb/k$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfb/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llb/c;Lfb/o;LGb/f;LAb/a;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lfb/k$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/k$e;

    invoke-direct {v0}, Lfb/k$e;-><init>()V

    sput-object v0, Lfb/k$e;->a:Lfb/k$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfb/k;)LDj/a;
    .locals 0

    invoke-static {}, Lgg/i;->W0()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfb/k;

    invoke-virtual {p0, p1}, Lfb/k$e;->a(Lfb/k;)LDj/a;

    move-result-object p1

    return-object p1
.end method
