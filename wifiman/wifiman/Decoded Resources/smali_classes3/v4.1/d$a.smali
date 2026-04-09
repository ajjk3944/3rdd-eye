.class public abstract Lv4/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/d$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/d$a;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/d$a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public c()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
.end method

.method public abstract e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
.end method
