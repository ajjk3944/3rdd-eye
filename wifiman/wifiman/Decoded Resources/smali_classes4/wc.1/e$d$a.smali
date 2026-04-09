.class final Lwc/e$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/e$d;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwc/e$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/e$d$a;

    invoke-direct {v0}, Lwc/e$d$a;-><init>()V

    sput-object v0, Lwc/e$d$a;->a:Lwc/e$d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwc/d$a;)Lwc/d$b$a;
    .locals 1

    const-string v0, "receiverState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwc/d$b$a;

    invoke-direct {v0, p1}, Lwc/d$b$a;-><init>(Lwc/d$a;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwc/d$a;

    invoke-virtual {p0, p1}, Lwc/e$d$a;->a(Lwc/d$a;)Lwc/d$b$a;

    move-result-object p1

    return-object p1
.end method
